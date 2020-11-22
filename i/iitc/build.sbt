organization := "org.scalablytyped.slinky"
name := "iitc"
version := "0.30-dt-20201111Z-1ee791"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20201002Z-de1c1d",
  "org.scalablytyped.slinky" %%% "jquery" % "3.5-dt-20201028Z-467d08",
  "org.scalablytyped.slinky" %%% "jqueryui" % "1.12-dt-20201002Z-73651a",
  "org.scalablytyped.slinky" %%% "leaflet" % "1.5-dt-20201012Z-bca55d",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20201002Z-017d7b",
  "org.scalablytyped.slinky" %%% "spectrum" % "1.5.1-dt-20201002Z-bffdf0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "tinycolor2" % "1.4-dt-20201002Z-3daba5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
