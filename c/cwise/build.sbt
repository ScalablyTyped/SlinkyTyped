organization := "org.scalablytyped.slinky"
name := "cwise"
version := "1.0-dt-20200515Z-23f9d0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cwise-compiler" % "1.1-dt-20200515Z-ad00aa",
  "org.scalablytyped.slinky" %%% "cwise-parser" % "1.0-dt-20200515Z-2cfbe8",
  "org.scalablytyped.slinky" %%% "ndarray" % "1.0-dt-20200515Z-f7125d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
