organization := "org.scalablytyped.slinky"
name := "bookshelf"
version := "v1.1.1-dt-20200515Z-70faaf"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200520Z-6ce100",
  "org.scalablytyped.slinky" %%% "create-error" % "0.3.1-dt-20200515Z-ab552e",
  "org.scalablytyped.slinky" %%% "knex" % "0.19.5-2859d1",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200519Z-08d73a",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
