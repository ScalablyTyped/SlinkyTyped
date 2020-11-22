organization := "org.scalablytyped.slinky"
name := "redux-sentry-middleware"
version := "0.1-dt-20200914Z-916485"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-f9ab72",
  "org.scalablytyped.slinky" %%% "sentry__browser" % "5.27.4-08037f",
  "org.scalablytyped.slinky" %%% "sentry__core" % "5.27.4-0bd3a7",
  "org.scalablytyped.slinky" %%% "sentry__hub" % "5.27.4-c47fd8",
  "org.scalablytyped.slinky" %%% "sentry__types" % "5.27.4-d9d6f6",
  "org.scalablytyped.slinky" %%% "sentry__utils" % "5.27.4-2f084c",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
