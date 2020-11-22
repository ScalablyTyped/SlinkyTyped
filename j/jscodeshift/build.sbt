organization := "org.scalablytyped.slinky"
name := "jscodeshift"
version := "0.7-dt-20201002Z-915e83"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ast-types" % "0.14.2-ab04a5",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.12.7-9a5e63",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.12.7-cdf83e",
  "org.scalablytyped.slinky" %%% "recast" % "0.19.1-9fdaba",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
