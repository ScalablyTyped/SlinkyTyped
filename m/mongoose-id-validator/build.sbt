organization := "org.scalablytyped.slinky"
name := "mongoose-id-validator"
version := "0.6-dt-20200929Z-fbfd4a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20201020Z-4f852e",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20201120Z-6bd85e",
  "org.scalablytyped.slinky" %%% "mongoose" % "5.10.9-dt-20201117Z-638210",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
