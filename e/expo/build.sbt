organization := "org.scalablytyped.slinky"
name := "expo"
version := "35.0.1-348c20"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "expo-asset" % "7.0.0-e5cd90",
  "org.scalablytyped.slinky" %%% "expo-constants" % "7.0.1-30bb80",
  "org.scalablytyped.slinky" %%% "expo-font" % "7.0.0-57e645",
  "org.scalablytyped.slinky" %%% "expo-linear-gradient" % "7.0.1-6b1f8f",
  "org.scalablytyped.slinky" %%% "expo-sqlite" % "7.0.0-8adf5e",
  "org.scalablytyped.slinky" %%% "expo__vector-icons" % "9.0-dt-20190213Z-385cdc",
  "org.scalablytyped.slinky" %%% "fbemitter" % "2.0.0-dt-20190503Z-656b1e",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-6c3558",
  "org.scalablytyped.slinky" %%% "react-native" % "0.60-dt-20191121Z-1e5ca0",
  "org.scalablytyped.slinky" %%% "react-native-vector-icons" % "6.4-dt-20191126Z-377086",
  "org.scalablytyped.slinky" %%% "react-native-view-shot" % "2.6.0-a85a20",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-ce6c4f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        