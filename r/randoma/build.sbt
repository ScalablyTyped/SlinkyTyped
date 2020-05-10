organization := "org.scalablytyped.slinky"
name := "randoma"
version := "1.3.0-9c0788"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "color" % "3.0-dt-20200225Z-3f6953",
  "org.scalablytyped.slinky" %%% "color-convert" % "1.9-dt-20191126Z-ea7c87",
  "org.scalablytyped.slinky" %%% "color-name" % "1.1-dt-20190212Z-40bb38",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
