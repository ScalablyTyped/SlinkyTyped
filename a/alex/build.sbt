organization := "org.scalablytyped.slinky"
name := "alex"
version := "9.0-dt-20200827Z-e2b2a9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "unist" % "2.0-dt-20190213Z-bfeec5",
  "org.scalablytyped.slinky" %%% "vfile" % "4.2.0-75c973",
  "org.scalablytyped.slinky" %%% "vfile-message" % "2.0.4-c4af87")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
