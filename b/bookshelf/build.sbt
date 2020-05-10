organization := "org.scalablytyped.slinky"
name := "bookshelf"
version := "v1.1.1-dt-20200410Z-789f93"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200302Z-1b60d9",
  "org.scalablytyped.slinky" %%% "create-error" % "0.3.1-dt-20200225Z-496f2b",
  "org.scalablytyped.slinky" %%% "knex" % "0.19.5-e83889",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200417Z-4d62ba",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
