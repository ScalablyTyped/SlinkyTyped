organization := "org.scalablytyped.slinky"
name := "glue"
version := "5.0-dt-20200515Z-0c6a12"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200515Z-8c37e1",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20200515Z-c3e167",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20200515Z-123d84",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20200515Z-08fda6",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200515Z-5fd104",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-0a8c94",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20200515Z-ecc637",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20200515Z-e4002e",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20200515Z-60fc3e",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
