organization := "org.scalablytyped.slinky"
name := "angular__router"
version := "8.2.14-d99c61"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "angular__common" % "8.2.14-ae4db7",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-7aa27b",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.3-93819f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-317bd7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        