organization := "org.scalablytyped.slinky"
name := "ionic__storage"
version := "2.2.0-b98073"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-479697",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-06fd0b",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-0a5fbb",
  "org.scalablytyped.slinky" %%% "localforage" % "1.7.3-cf6eae",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-e2a094",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-86bf9e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200225Z-7a8959",
  "org.scalablytyped.slinky" %%% "typescript" % "3.8.3-472acc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
