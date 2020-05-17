organization := "org.scalablytyped.slinky"
name := "npm-registry-fetch"
version := "8.0-dt-20200323Z-cbe380"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-78ba56",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "node-fetch" % "2.5-dt-20200423Z-7f9dce",
  "org.scalablytyped.slinky" %%% "npm-package-arg" % "6.1-dt-20181031Z-ea193a",
  "org.scalablytyped.slinky" %%% "npmlog" % "4.1-dt-20190626Z-51de6c",
  "org.scalablytyped.slinky" %%% "ssri" % "6.0-dt-20200424Z-71d12e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
