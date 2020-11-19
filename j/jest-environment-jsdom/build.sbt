organization := "org.scalablytyped.slinky"
name := "jest-environment-jsdom"
version := "26.2.0-0f6301"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-5d64c8",
  "org.scalablytyped.slinky" %%% "jest-mock" % "24.9.0-ca12fd",
  "org.scalablytyped.slinky" %%% "jest__environment" % "26.2.0-ae3bd5",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-9ce9dc",
  "org.scalablytyped.slinky" %%% "jsdom" % "16.2-dt-20200515Z-59b15a",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "parse5" % "5.0-dt-20200515Z-5b7292",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20200515Z-03bfc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
