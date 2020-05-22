organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.2.4-177437"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.26.1-902a25",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.27-7851a2",
  "org.scalablytyped.slinky" %%% "moment" % "2.26.0-72acea",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.2.4-ffd761",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.1.0-5a3d7a",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.1.0-2bd0c3",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.3.2-e23f06",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.4.16-a78e75",
  "org.scalablytyped.slinky" %%% "rc-select" % "v5.9.0-dt-20200515Z-8740bd",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.5.9-3e6c18",
  "org.scalablytyped.slinky" %%% "rc-tree" % "1.11-dt-20200515Z-a012e9",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "3.1.3-c309fe",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.22-579e1f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
