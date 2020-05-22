organization := "org.scalablytyped.slinky"
name := "app-builder-lib"
version := "21.2.0-c22322"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "builder-util" % "21.2.0-e3d2a7",
  "org.scalablytyped.slinky" %%% "builder-util-runtime" % "8.3.0-f8256f",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-dacba6",
  "org.scalablytyped.slinky" %%% "electron-publish" % "21.2.0-ae3d19",
  "org.scalablytyped.slinky" %%% "fs-extra" % "9.0-dt-20200519Z-97cccb",
  "org.scalablytyped.slinky" %%% "lazy-val" % "1.0.4-5b4fa7",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "temp-file" % "3.3.4-6fa457")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
