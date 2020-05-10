organization := "org.scalablytyped.slinky"
name := "babel-plugin-macros"
version := "2.8-dt-20200225Z-224a77"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "babel__core" % "7.1-dt-20200331Z-241341",
  "org.scalablytyped.slinky" %%% "babel__generator" % "7.6-dt-20191210Z-0d7730",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.9.3-1cb111",
  "org.scalablytyped.slinky" %%% "babel__template" % "7.0-dt-20190213Z-778a3a",
  "org.scalablytyped.slinky" %%% "babel__traverse" % "7.0-dt-20200406Z-6d18eb",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.9.0-911385",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
