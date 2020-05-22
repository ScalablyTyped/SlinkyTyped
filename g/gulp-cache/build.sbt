organization := "org.scalablytyped.slinky"
name := "gulp-cache"
version := "v0.4.5-dt-20200515Z-071198"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chalk" % "2.4.2-3af11d",
  "org.scalablytyped.slinky" %%% "gulp-util" % "3.0-dt-20200515Z-46b018",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "through2" % "2.0-dt-20200515Z-57dd1b",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200515Z-6c877b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
