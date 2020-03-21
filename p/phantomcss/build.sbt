organization := "org.scalablytyped.slinky"
name := "phantomcss"
version := "0.11.1-dt-20200225Z-e5c1e8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "casperjs" % "1.1-dt-20200226Z-f533b3",
  "org.scalablytyped.slinky" %%% "phantomjs" % "1.9-dt-20200226Z-48391a",
  "org.scalablytyped.slinky" %%% "resemblejs" % "v1.3.0-dt-20200227Z-58ae9f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
