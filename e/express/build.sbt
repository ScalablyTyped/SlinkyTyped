organization := "org.scalablytyped.slinky"
name := "express"
version := "4.17-dt-20200515Z-3b430d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-270be7",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-28329b",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200515Z-49b151",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200515Z-22dd62",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200609Z-a81c57",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-ed5b33",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-3a96cb",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-78758b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-a77a62")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
