organization := "org.scalablytyped.slinky"
name := "joigoose"
version := "2.0-dt-20200515Z-ae49f2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20200515Z-3565c2",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200515Z-5fd104",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20200518Z-608e56",
  "org.scalablytyped.slinky" %%% "mongoose" % "5.7.13-dt-20200519Z-569ac6",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
