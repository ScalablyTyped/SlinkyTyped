organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.3.4-cde128"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.26.2-332955",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-2278c5",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.28-fdf2d0",
  "org.scalablytyped.slinky" %%% "moment" % "2.26.0-fbbb11",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-360342",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.4.4-f8e877",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.2.0-5efb63",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.3.1-faf112",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.4.0-35c9e2",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.6.4-d8e9aa",
  "org.scalablytyped.slinky" %%% "rc-select" % "v5.9.0-dt-20200515Z-c20004",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.8.0-34b1d0",
  "org.scalablytyped.slinky" %%% "rc-tree" % "1.11-dt-20200515Z-0b6671",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "4.0.1-93c1fc",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-036789",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.22-785a50",
  "org.scalablytyped.slinky" %%% "std" % "3.9-dec240")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
