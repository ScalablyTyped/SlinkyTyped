organization := "org.scalablytyped.slinky"
name := "randoma"
version := "1.3.0-9dc588"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "color" % "3.0-dt-20200102Z-204768",
  "org.scalablytyped.slinky" %%% "color-convert" % "1.9-dt-20191126Z-65e58d",
  "org.scalablytyped.slinky" %%% "color-name" % "1.1-dt-20190212Z-c20533",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        