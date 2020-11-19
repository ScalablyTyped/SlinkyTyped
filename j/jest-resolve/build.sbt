organization := "org.scalablytyped.slinky"
name := "jest-resolve"
version := "24.9.0-e072b2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20200515Z-368529",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-5d64c8",
  "org.scalablytyped.slinky" %%% "jest-haste-map" % "24.9.0-568905",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-9ce9dc",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
