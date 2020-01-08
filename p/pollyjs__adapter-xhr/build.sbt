organization := "org.scalablytyped.slinky"
name := "pollyjs__adapter-xhr"
version := "2.6-dt-20190726Z-0343c4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "pollyjs__adapter" % "3.0-dt-20191226Z-7e8cb8",
  "org.scalablytyped.slinky" %%% "pollyjs__core" % "3.0-dt-20191226Z-865f09",
  "org.scalablytyped.slinky" %%% "pollyjs__persister" % "2.0-dt-20190731Z-df5bae",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        