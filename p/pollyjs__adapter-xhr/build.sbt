organization := "org.scalablytyped.slinky"
name := "pollyjs__adapter-xhr"
version := "2.6-dt-20190726Z-bccdb1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "pollyjs__adapter" % "3.0-dt-20200225Z-031531",
  "org.scalablytyped.slinky" %%% "pollyjs__core" % "4.0-dt-20200125Z-669769",
  "org.scalablytyped.slinky" %%% "pollyjs__persister" % "2.0-dt-20200225Z-208f03",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
