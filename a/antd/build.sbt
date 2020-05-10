organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.0.4-a77974"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.25.5-28d2f5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.23-f8ad73",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-25e9d0",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-24495c",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.0.1-2222a3",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.0.1-9b5e5b",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.0.2-84c229",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.0.0-c04acf",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.1.5-6e745c",
  "org.scalablytyped.slinky" %%% "rc-select" % "v5.9.0-dt-20200226Z-0cc47a",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.3.10-bd33e9",
  "org.scalablytyped.slinky" %%% "rc-tree" % "1.11-dt-20190212Z-782a5a",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "3.0.5-102dbb",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-47fb9f",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.22-c41d16",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
