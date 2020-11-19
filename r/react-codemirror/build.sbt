organization := "org.scalablytyped.slinky"
name := "react-codemirror"
version := "v1.0.0-dt-20200515Z-e90a0a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "codemirror" % "0.0-unknown-dt-20200712Z-2af8f4",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-fce754",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200623Z-5f5d40",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ce652f",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-6a9854",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "tern" % "0.23-dt-20200515Z-7ae1f6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
