organization := "org.scalablytyped.slinky"
name := "rx"
version := "4.1-dt-20200225Z-0ed226"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20200225Z-5c3f0e",
  "org.scalablytyped.slinky" %%% "rx-core-binding" % "4.0-dt-20200225Z-c4d4d9",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20200225Z-fcc49b",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-57033c",
  "org.scalablytyped.slinky" %%% "rx-lite-async" % "4.0-dt-20200225Z-475a86",
  "org.scalablytyped.slinky" %%% "rx-lite-backpressure" % "4.0-dt-20200225Z-7c89e2",
  "org.scalablytyped.slinky" %%% "rx-lite-coincidence" % "4.0-dt-20200225Z-4687d5",
  "org.scalablytyped.slinky" %%% "rx-lite-experimental" % "4.0-dt-20200225Z-d49c86",
  "org.scalablytyped.slinky" %%% "rx-lite-joinpatterns" % "4.0-dt-20200225Z-93bdb3",
  "org.scalablytyped.slinky" %%% "rx-lite-testing" % "4.0-dt-20200225Z-64aeba",
  "org.scalablytyped.slinky" %%% "rx-lite-time" % "4.0-dt-20200225Z-161aea",
  "org.scalablytyped.slinky" %%% "rx-lite-virtualtime" % "4.0-dt-20200225Z-78d706",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
