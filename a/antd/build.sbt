organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.0.0-dffcf3"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.25.5-544b8e",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-89abae",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.20-d9f924",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-ca8f54",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-6bb503",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.0.1-138f3f",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.0.1-ec39dd",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.0.2-12402e",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.0.0-64785a",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.1.2-cf5c25",
  "org.scalablytyped.slinky" %%% "rc-select" % "v5.9.0-dt-20200226Z-61199d",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.0.0-6527b5",
  "org.scalablytyped.slinky" %%% "rc-tree" % "1.11-dt-20190212Z-8c6dde",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "3.0.2-b1053d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200227Z-f18fda",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.22-c48364",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
