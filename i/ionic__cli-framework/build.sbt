organization := "org.scalablytyped.slinky"
name := "ionic__cli-framework"
version := "3.0.6-c417d7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.6-080c27",
  "org.scalablytyped.slinky" %%% "log-update" % "3.4.0-00ea64",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20200225Z-e0ee53",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-0e87eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
