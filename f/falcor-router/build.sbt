organization := "org.scalablytyped.slinky"
name := "falcor-router"
version := "0.8-dt-20201002Z-39e778"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "falcor" % "2.0-dt-20200515Z-cc8c02",
  "org.scalablytyped.slinky" %%% "falcor-http-datasource" % "0.1.3-dt-20201002Z-86ccd4",
  "org.scalablytyped.slinky" %%% "falcor-json-graph" % "1.1.7-dt-20201002Z-b11662",
  "org.scalablytyped.slinky" %%% "rx" % "4.1.0-ce8b6f",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
