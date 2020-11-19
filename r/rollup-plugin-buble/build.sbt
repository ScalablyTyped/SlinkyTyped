organization := "org.scalablytyped.slinky"
name := "rollup-plugin-buble"
version := "0.19-dt-20190312Z-741e60"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "buble" % "0.19-dt-20190312Z-9132f1",
  "org.scalablytyped.slinky" %%% "magic-string" % "0.25.7-6c6533",
  "org.scalablytyped.slinky" %%% "rollup" % "2.23.0-aa2727",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
