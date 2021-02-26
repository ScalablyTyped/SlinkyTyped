organization := "org.scalablytyped.slinky"
name := "markdown-it-anchor"
version := "4.0-dt-20200515Z-94ccbe"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "linkify-it" % "2.1.0-dt-20200515Z-df00d4",
  "org.scalablytyped.slinky" %%% "markdown-it" % "v10.0.0-dt-20201109Z-4715c0",
  "org.scalablytyped.slinky" %%% "mdurl" % "1.0-dt-20200515Z-a341e6",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
