organization := "org.scalablytyped.slinky"
name := "rollup-plugin-buble"
version := "0.19-dt-20190312Z-6c2d99"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "buble" % "0.19-dt-20190312Z-9ece05",
  "org.scalablytyped.slinky" %%% "magic-string" % "0.25.7-d2803e",
  "org.scalablytyped.slinky" %%% "rollup" % "2.33.3-4f9172",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
