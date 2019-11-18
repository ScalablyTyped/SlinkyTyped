organization := "org.scalablytyped.slinky"
name := "expo-location"
version := "7.0.0-c43ee4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-834b48",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-242933",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191025Z-b3a7f8",
  "org.scalablytyped.slinky" %%% "react-native" % "0.60-dt-20191028Z-a2c05a",
  "org.scalablytyped.slinky" %%% "std" % "3.7-41c436",
  "org.scalablytyped.slinky" %%% "unimodules__core" % "4.0.0-881d87",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-a8966f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        