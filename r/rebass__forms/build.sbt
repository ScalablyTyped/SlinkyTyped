organization := "org.scalablytyped.slinky"
name := "rebass__forms"
version := "4.0-dt-20200427Z-34a253"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-54b080",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200423Z-550f26",
  "org.scalablytyped.slinky" %%% "rebass" % "4.0-dt-20200406Z-ba351e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "styled-components" % "5.1-dt-20200413Z-f84ce5",
  "org.scalablytyped.slinky" %%% "styled-system" % "5.1-dt-20200309Z-10a332",
  "org.scalablytyped.slinky" %%% "styled-system__css" % "5.0-dt-20200331Z-1f41b5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
