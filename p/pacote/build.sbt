organization := "org.scalablytyped.slinky"
name := "pacote"
version := "11.1-dt-20200327Z-17049c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "form-data" % "3.0.0-cbc882",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "node-fetch" % "2.5-dt-20200515Z-471b49",
  "org.scalablytyped.slinky" %%% "npm-package-arg" % "6.1-dt-20200515Z-2c4144",
  "org.scalablytyped.slinky" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-e88fbf",
  "org.scalablytyped.slinky" %%% "npmlog" % "4.1-dt-20190626Z-ed7ac4",
  "org.scalablytyped.slinky" %%% "ssri" % "7.1-dt-20200620Z-3eb170",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
