organization := "org.scalablytyped.slinky"
name := "ionic__cli-framework"
version := "3.0.3-f53240"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.5-2827d2",
  "org.scalablytyped.slinky" %%% "log-update" % "3.3.0-6c5acd",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20190322Z-322150",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-1c762e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        