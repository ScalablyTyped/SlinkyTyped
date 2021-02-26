organization := "org.scalablytyped.slinky"
name := "npm-profile"
version := "5.0-dt-20200908Z-23b600"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "form-data" % "3.0.0-113260",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "node-fetch" % "2.5-dt-20200515Z-1b8594",
  "org.scalablytyped.slinky" %%% "npm-package-arg" % "6.1-dt-20200515Z-65a744",
  "org.scalablytyped.slinky" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-c6f18e",
  "org.scalablytyped.slinky" %%% "npmlog" % "4.1-dt-20190626Z-f0d4d7",
  "org.scalablytyped.slinky" %%% "ssri" % "7.1-dt-20200620Z-6f79bf",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
