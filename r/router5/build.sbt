organization := "org.scalablytyped.slinky"
name := "router5"
version := "7.0.2-218f28"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "path-parser" % "4.2.0-6b00e5",
  "org.scalablytyped.slinky" %%% "route-node" % "3.4.2-58bb81",
  "org.scalablytyped.slinky" %%% "router5-transition-path" % "7.0.1-e47362",
  "org.scalablytyped.slinky" %%% "search-params" % "2.1.3-589317",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        