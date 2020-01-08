organization := "org.scalablytyped.slinky"
name := "rebass__forms"
version := "4.0-dt-20191227Z-399280"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-adc998",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "react-native" % "0.60-dt-20191230Z-df9948",
  "org.scalablytyped.slinky" %%% "rebass" % "4.0-dt-20191016Z-7ac5d9",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "styled-components" % "4.4-dt-20191209Z-daed2e",
  "org.scalablytyped.slinky" %%% "styled-system" % "5.1-dt-20191118Z-ca3bcb",
  "org.scalablytyped.slinky" %%% "styled-system__css" % "5.0-dt-20191115Z-21ce97")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        