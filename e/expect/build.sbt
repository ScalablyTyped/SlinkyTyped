organization := "org.scalablytyped.slinky"
name := "expect"
version := "24.9.0-e21b98"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "chalk" % "2.4.2-7b8616",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-10f02e",
  "org.scalablytyped.slinky" %%% "jest-matcher-utils" % "21.0-dt-20190212Z-03ef0a",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-d63b3a",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "yargs" % "13.0-dt-20191126Z-86e58c",
  "org.scalablytyped.slinky" %%% "yargs-parser" % "13.1-dt-20190905Z-3625ad")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        