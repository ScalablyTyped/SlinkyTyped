organization := "org.scalablytyped.slinky"
name := "randoma"
version := "1.3.0-3e20cb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "color" % "3.0-dt-20191014Z-c1f5ca",
  "org.scalablytyped.slinky" %%% "color-convert" % "1.9-dt-20191126Z-99377d",
  "org.scalablytyped.slinky" %%% "color-name" % "1.1-dt-20190212Z-9ea2bd",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        