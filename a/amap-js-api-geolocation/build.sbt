organization := "org.scalablytyped.slinky"
name := "amap-js-api-geolocation"
version := "1.4-dt-20190409Z-9a6e08"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "amap-js-api" % "1.4-dt-20200129Z-4f52f8",
  "org.scalablytyped.slinky" %%% "amap-js-api-geocoder" % "1.4-dt-20190331Z-409aeb",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
