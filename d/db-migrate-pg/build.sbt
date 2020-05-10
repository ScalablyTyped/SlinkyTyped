organization := "org.scalablytyped.slinky"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20200226Z-5a5167"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200302Z-1b60d9",
  "org.scalablytyped.slinky" %%% "db-migrate-base" % "0.0-unknown-dt-20200226Z-8565a1",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "pg" % "7.14-dt-20200314Z-4cf49e",
  "org.scalablytyped.slinky" %%% "pg-types" % "1.11-dt-20191101Z-cd411c",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
