organization := "org.scalablytyped.slinky"
name := "octokit__plugin-rest-endpoint-methods"
version := "4.2.1-fb7046"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "before-after-hook" % "2.1.0-b5667e",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "octokit__core" % "3.2.1-e0e927",
  "org.scalablytyped.slinky" %%% "octokit__graphql" % "4.5.7-2a0635",
  "org.scalablytyped.slinky" %%% "octokit__types" % "5.5.0-21dae0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
