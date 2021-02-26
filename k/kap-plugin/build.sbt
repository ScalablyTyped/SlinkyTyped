organization := "org.scalablytyped.slinky"
name := "kap-plugin"
version := "1.0-dt-20200817Z-a6cb24"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "conf" % "7.1.2-e5d974",
  "org.scalablytyped.slinky" %%% "electron-store" % "6.0.1-7f7035",
  "org.scalablytyped.slinky" %%% "got" % "9.6-dt-20200515Z-50ffcb",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200831Z-3ccc60",
  "org.scalablytyped.slinky" %%% "json-schema-typed" % "7.0.3-545b74",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20201002Z-b0ea7d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
