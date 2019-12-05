organization := "org.scalablytyped.slinky"
name := "jasmine-jquery"
version := "1.5.8-dt-20190322Z-aa84c2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "jasmine" % "3.5-dt-20191122Z-b7917e",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20191126Z-ae0751",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-c4cdb0",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        