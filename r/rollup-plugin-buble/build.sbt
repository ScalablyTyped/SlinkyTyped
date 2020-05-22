organization := "org.scalablytyped.slinky"
name := "rollup-plugin-buble"
version := "0.19-dt-20190312Z-e2cc56"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "buble" % "0.19-dt-20190312Z-d4b76e",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200515Z-8cb760",
  "org.scalablytyped.slinky" %%% "magic-string" % "0.25.4-7f3b33",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "rollup" % "1.32.1-d427d3",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
