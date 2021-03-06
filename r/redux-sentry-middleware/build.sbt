organization := "org.scalablytyped.slinky"
name := "redux-sentry-middleware"
version := "0.1-dt-20200914Z-f5144e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-9bd9e7",
  "org.scalablytyped.slinky" %%% "sentry__browser" % "5.27.4-648a6d",
  "org.scalablytyped.slinky" %%% "sentry__core" % "5.27.4-b7d29c",
  "org.scalablytyped.slinky" %%% "sentry__hub" % "5.27.4-6ebfa1",
  "org.scalablytyped.slinky" %%% "sentry__types" % "5.27.4-562ab1",
  "org.scalablytyped.slinky" %%% "sentry__utils" % "5.27.4-cd39b8",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
