organization := "org.scalablytyped.slinky"
name := "pollyjs__adapter-node-http"
version := "2.0-dt-20200925Z-f1899e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "pollyjs__adapter" % "4.3-dt-20200925Z-0412c1",
  "org.scalablytyped.slinky" %%% "pollyjs__core" % "4.3-dt-20200925Z-dd3d9b",
  "org.scalablytyped.slinky" %%% "pollyjs__persister" % "4.3-dt-20200925Z-27a0a5",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
