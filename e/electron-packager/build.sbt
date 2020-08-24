organization := "org.scalablytyped.slinky"
name := "electron-packager"
version := "15.0.0-8a7205"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "asar" % "3.0.3-5f8ba3",
  "org.scalablytyped.slinky" %%% "electron-notarize" % "1.0.0-5449ba",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200706Z-07f914",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-f9bd51",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
