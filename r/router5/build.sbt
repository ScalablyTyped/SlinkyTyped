organization := "org.scalablytyped.slinky"
name := "router5"
version := "8.0.1-8306ad"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "path-parser" % "6.1.0-70dc5e",
  "org.scalablytyped.slinky" %%% "route-node" % "4.1.1-f5c847",
  "org.scalablytyped.slinky" %%% "router5-transition-path" % "8.0.1-15539c",
  "org.scalablytyped.slinky" %%% "search-params" % "3.0.0-48376a",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
