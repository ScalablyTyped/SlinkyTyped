organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.3.4-1e553b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.26.2-83f215",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-9fcfdc",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.28-884040",
  "org.scalablytyped.slinky" %%% "moment" % "2.26.0-705ed0",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-77dff4",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.4.4-b515de",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.2.0-9bfd34",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.3.1-977d96",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.4.0-4fbd6c",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.6.4-04074b",
  "org.scalablytyped.slinky" %%% "rc-select" % "v5.9.0-dt-20200515Z-7f02de",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.8.0-fecad4",
  "org.scalablytyped.slinky" %%% "rc-tree" % "1.11-dt-20200515Z-b0fc63",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "4.0.1-ffad9b",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-0ab4bf",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.22-65b1fa",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
