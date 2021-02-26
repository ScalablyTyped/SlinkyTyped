organization := "org.scalablytyped.slinky"
name := "phantomcss"
version := "0.11.1-dt-20201002Z-e7ed09"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "casperjs" % "1.1-dt-20200515Z-d62ed7",
  "org.scalablytyped.slinky" %%% "phantomjs" % "1.9-dt-20201002Z-e030e2",
  "org.scalablytyped.slinky" %%% "resemblejs" % "v1.3.0-dt-20201002Z-1eb255",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
